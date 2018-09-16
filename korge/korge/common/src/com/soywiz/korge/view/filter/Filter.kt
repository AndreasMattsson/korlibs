package com.soywiz.korge.view.filter

import com.soywiz.korag.*
import com.soywiz.korag.shader.*
import com.soywiz.korge.render.*
import com.soywiz.korge.view.*
import com.soywiz.korge.view.effect.*
import com.soywiz.korma.*

abstract class Filter {
	companion object {
		//val u_Time = Uniform("time", VarType.Float1)
		val u_TextureSize = Uniform("effectTextureSize", VarType.Float2)
		val DEFAULT_FRAGMENT = BatchBuilder2D.buildTextureLookupFragment(premultiplied = false)

		val Program.Builder.fragmentCoords01 get() = DefaultShaders.v_Tex["xy"]
		val Program.Builder.fragmentCoords get() = fragmentCoords01 * u_TextureSize
		fun Program.Builder.tex(coords: Operand) = texture2D(DefaultShaders.u_Tex, coords / u_TextureSize)
	}

	private val textureSizeHolder = FloatArray(2)

	val uniforms = AG.UniformValues(
		//Filter.u_Time to timeHolder,
		Filter.u_TextureSize to textureSizeHolder
	)

	open val border: Int = 0

	var program: Program? = null

	var vertex: VertexShader = BatchBuilder2D.VERTEX
		set(value) {
			field = value
			program = null
		}
	var fragment: FragmentShader = Filter.DEFAULT_FRAGMENT
		set(value) {
			field = value
			program = null
		}

	internal val tempMat2d = Matrix2d()
	internal val oldViewMatrix = Matrix4()

	protected open fun updateUniforms() {
	}

	open fun render(
		ctx: RenderContext,
		matrix: Matrix2d,
		texture: Texture,
		texWidth: Int,
		texHeight: Int,
		renderColorAdd: Int,
		renderColorMulInt: Int,
		blendMode: BlendMode
	) {
		//println("$this.render()")
		// @TODO: Precompute vertices
		textureSizeHolder[0] = texture.base.width.toFloat()
		textureSizeHolder[1] = texture.base.height.toFloat()
		updateUniforms()

		if (program == null) program = Program(vertex, fragment)

		ctx.batch.setTemporalUniforms(this.uniforms) {
			ctx.batch.drawQuad(
				texture,
				m = matrix,
				filtering = true,
				colorAdd = renderColorAdd,
				colorMulInt = renderColorMulInt,
				blendFactors = blendMode.factors,
				program = program
			)
		}
	}
}
