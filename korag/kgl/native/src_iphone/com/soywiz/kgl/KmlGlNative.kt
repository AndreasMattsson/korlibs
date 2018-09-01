// WARNING: File autogenerated DO NOT modify
// https://www.khronos.org/registry/OpenGL/api/GLES2/gl2.h
@file:Suppress("unused", "RedundantUnitReturnType", "PropertyName")

package com.soywiz.kgl

import com.soywiz.kmem.*
import kotlinx.cinterop.*
import com.soywiz.korim.bitmap.*
import com.soywiz.korim.format.*
import platform.gles2.*
import platform.posix.*

class KmlGlNative : KmlGl() {
	val tempBufferAddress = TempBufferAddress()
    override fun activeTexture(texture: Int): Unit = tempBufferAddress { glActiveTexture(texture) }
    override fun attachShader(program: Int, shader: Int): Unit = tempBufferAddress { glAttachShader(program, shader) }
    override fun bindAttribLocation(program: Int, index: Int, name: String): Unit = memScoped { tempBufferAddress { glBindAttribLocation(program, index, name) } }
    override fun bindBuffer(target: Int, buffer: Int): Unit = tempBufferAddress { glBindBuffer(target, buffer) }
    override fun bindFramebuffer(target: Int, framebuffer: Int): Unit = tempBufferAddress { glBindFramebuffer(target, framebuffer) }
    override fun bindRenderbuffer(target: Int, renderbuffer: Int): Unit = tempBufferAddress { glBindRenderbuffer(target, renderbuffer) }
    override fun bindTexture(target: Int, texture: Int): Unit = tempBufferAddress { glBindTexture(target, texture) }
    override fun blendColor(red: Float, green: Float, blue: Float, alpha: Float): Unit = tempBufferAddress { glBlendColor(red, green, blue, alpha) }
    override fun blendEquation(mode: Int): Unit = tempBufferAddress { glBlendEquation(mode) }
    override fun blendEquationSeparate(modeRGB: Int, modeAlpha: Int): Unit = tempBufferAddress { glBlendEquationSeparate(modeRGB, modeAlpha) }
    override fun blendFunc(sfactor: Int, dfactor: Int): Unit = tempBufferAddress { glBlendFunc(sfactor, dfactor) }
    override fun blendFuncSeparate(sfactorRGB: Int, dfactorRGB: Int, sfactorAlpha: Int, dfactorAlpha: Int): Unit = tempBufferAddress { glBlendFuncSeparate(sfactorRGB, dfactorRGB, sfactorAlpha, dfactorAlpha) }
    override fun bufferData(target: Int, size: Int, data: KmlNativeBuffer, usage: Int): Unit = tempBufferAddress { glBufferData(target, size.convertSize(), data.unsafeAddress().reinterpret(), usage) }
    override fun bufferSubData(target: Int, offset: Int, size: Int, data: KmlNativeBuffer): Unit = tempBufferAddress { glBufferSubData(target, offset.convertSize(), size.convertSize(), data.unsafeAddress().reinterpret()) }
    override fun checkFramebufferStatus(target: Int): Int = tempBufferAddress { glCheckFramebufferStatus(target) }
    override fun clear(mask: Int): Unit = tempBufferAddress { glClear(mask) }
    override fun clearColor(red: Float, green: Float, blue: Float, alpha: Float): Unit = tempBufferAddress { glClearColor(red, green, blue, alpha) }
    override fun clearDepthf(d: Float): Unit = tempBufferAddress { glClearDepthf(d) }
    override fun clearStencil(s: Int): Unit = tempBufferAddress { glClearStencil(s) }
    override fun colorMask(red: Boolean, green: Boolean, blue: Boolean, alpha: Boolean): Unit = tempBufferAddress { glColorMask(red.convert(), green.convert(), blue.convert(), alpha.convert()) }
    override fun compileShader(shader: Int): Unit = tempBufferAddress { glCompileShader(shader) }
    override fun compressedTexImage2D(target: Int, level: Int, internalformat: Int, width: Int, height: Int, border: Int, imageSize: Int, data: KmlNativeBuffer): Unit = tempBufferAddress { glCompressedTexImage2D(target, level, internalformat, width, height, border, imageSize, data.unsafeAddress().reinterpret()) }
    override fun compressedTexSubImage2D(target: Int, level: Int, xoffset: Int, yoffset: Int, width: Int, height: Int, format: Int, imageSize: Int, data: KmlNativeBuffer): Unit = tempBufferAddress { glCompressedTexSubImage2D(target, level, xoffset, yoffset, width, height, format, imageSize, data.unsafeAddress().reinterpret()) }
    override fun copyTexImage2D(target: Int, level: Int, internalformat: Int, x: Int, y: Int, width: Int, height: Int, border: Int): Unit = tempBufferAddress { glCopyTexImage2D(target, level, internalformat, x, y, width, height, border) }
    override fun copyTexSubImage2D(target: Int, level: Int, xoffset: Int, yoffset: Int, x: Int, y: Int, width: Int, height: Int): Unit = tempBufferAddress { glCopyTexSubImage2D(target, level, xoffset, yoffset, x, y, width, height) }
    override fun createProgram(): Int = tempBufferAddress { glCreateProgram() }
    override fun createShader(type: Int): Int = tempBufferAddress { glCreateShader(type) }
    override fun cullFace(mode: Int): Unit = tempBufferAddress { glCullFace(mode) }
    override fun deleteBuffers(n: Int, items: KmlNativeBuffer): Unit = tempBufferAddress { glDeleteBuffers(n, items.unsafeAddress().reinterpret()) }
    override fun deleteFramebuffers(n: Int, items: KmlNativeBuffer): Unit = tempBufferAddress { glDeleteFramebuffers(n, items.unsafeAddress().reinterpret()) }
    override fun deleteProgram(program: Int): Unit = tempBufferAddress { glDeleteProgram(program) }
    override fun deleteRenderbuffers(n: Int, items: KmlNativeBuffer): Unit = tempBufferAddress { glDeleteRenderbuffers(n, items.unsafeAddress().reinterpret()) }
    override fun deleteShader(shader: Int): Unit = tempBufferAddress { glDeleteShader(shader) }
    override fun deleteTextures(n: Int, items: KmlNativeBuffer): Unit = tempBufferAddress { glDeleteTextures(n, items.unsafeAddress().reinterpret()) }
    override fun depthFunc(func: Int): Unit = tempBufferAddress { glDepthFunc(func) }
    override fun depthMask(flag: Boolean): Unit = tempBufferAddress { glDepthMask(flag.convert()) }
    override fun depthRangef(n: Float, f: Float): Unit = tempBufferAddress { glDepthRangef(n, f) }
    override fun detachShader(program: Int, shader: Int): Unit = tempBufferAddress { glDetachShader(program, shader) }
    override fun disable(cap: Int): Unit = tempBufferAddress { glDisable(cap) }
    override fun disableVertexAttribArray(index: Int): Unit = tempBufferAddress { glDisableVertexAttribArray(index) }
    override fun drawArrays(mode: Int, first: Int, count: Int): Unit = tempBufferAddress { glDrawArrays(mode, first, count) }
    override fun drawElements(mode: Int, count: Int, type: Int, indices: Int): Unit = tempBufferAddress { glDrawElements(mode, count, type, indices.reinterpret()) }
    override fun enable(cap: Int): Unit = tempBufferAddress { glEnable(cap) }
    override fun enableVertexAttribArray(index: Int): Unit = tempBufferAddress { glEnableVertexAttribArray(index) }
    override fun finish(): Unit = tempBufferAddress { glFinish() }
    override fun flush(): Unit = tempBufferAddress { glFlush() }
    override fun framebufferRenderbuffer(target: Int, attachment: Int, renderbuffertarget: Int, renderbuffer: Int): Unit = tempBufferAddress { glFramebufferRenderbuffer(target, attachment, renderbuffertarget, renderbuffer) }
    override fun framebufferTexture2D(target: Int, attachment: Int, textarget: Int, texture: Int, level: Int): Unit = tempBufferAddress { glFramebufferTexture2D(target, attachment, textarget, texture, level) }
    override fun frontFace(mode: Int): Unit = tempBufferAddress { glFrontFace(mode) }
    override fun genBuffers(n: Int, buffers: KmlNativeBuffer): Unit = tempBufferAddress { glGenBuffers(n, buffers.unsafeAddress().reinterpret()) }
    override fun generateMipmap(target: Int): Unit = tempBufferAddress { glGenerateMipmap(target) }
    override fun genFramebuffers(n: Int, framebuffers: KmlNativeBuffer): Unit = tempBufferAddress { glGenFramebuffers(n, framebuffers.unsafeAddress().reinterpret()) }
    override fun genRenderbuffers(n: Int, renderbuffers: KmlNativeBuffer): Unit = tempBufferAddress { glGenRenderbuffers(n, renderbuffers.unsafeAddress().reinterpret()) }
    override fun genTextures(n: Int, textures: KmlNativeBuffer): Unit = tempBufferAddress { glGenTextures(n, textures.unsafeAddress().reinterpret()) }
    override fun getActiveAttrib(program: Int, index: Int, bufSize: Int, length: KmlNativeBuffer, size: KmlNativeBuffer, type: KmlNativeBuffer, name: KmlNativeBuffer): Unit = tempBufferAddress { glGetActiveAttrib(program, index, bufSize, length.unsafeAddress().reinterpret(), size.unsafeAddress().reinterpret(), type.unsafeAddress().reinterpret(), name.unsafeAddress().reinterpret()) }
    override fun getActiveUniform(program: Int, index: Int, bufSize: Int, length: KmlNativeBuffer, size: KmlNativeBuffer, type: KmlNativeBuffer, name: KmlNativeBuffer): Unit = tempBufferAddress { glGetActiveUniform(program, index, bufSize, length.unsafeAddress().reinterpret(), size.unsafeAddress().reinterpret(), type.unsafeAddress().reinterpret(), name.unsafeAddress().reinterpret()) }
    override fun getAttachedShaders(program: Int, maxCount: Int, count: KmlNativeBuffer, shaders: KmlNativeBuffer): Unit = tempBufferAddress { glGetAttachedShaders(program, maxCount, count.unsafeAddress().reinterpret(), shaders.unsafeAddress().reinterpret()) }
    override fun getAttribLocation(program: Int, name: String): Int = memScoped { tempBufferAddress { glGetAttribLocation(program, name) } }
    override fun getUniformLocation(program: Int, name: String): Int = memScoped { tempBufferAddress { glGetUniformLocation(program, name) } }
    override fun getBooleanv(pname: Int, data: KmlNativeBuffer): Unit = tempBufferAddress { glGetBooleanv(pname, data.unsafeAddress().reinterpret()) }
    override fun getBufferParameteriv(target: Int, pname: Int, params: KmlNativeBuffer): Unit = tempBufferAddress { glGetBufferParameteriv(target, pname, params.unsafeAddress().reinterpret()) }
    override fun getError(): Int = tempBufferAddress { glGetError() }
    override fun getFloatv(pname: Int, data: KmlNativeBuffer): Unit = tempBufferAddress { glGetFloatv(pname, data.unsafeAddress().reinterpret()) }
    override fun getFramebufferAttachmentParameteriv(target: Int, attachment: Int, pname: Int, params: KmlNativeBuffer): Unit = tempBufferAddress { glGetFramebufferAttachmentParameteriv(target, attachment, pname, params.unsafeAddress().reinterpret()) }
    override fun getIntegerv(pname: Int, data: KmlNativeBuffer): Unit = tempBufferAddress { glGetIntegerv(pname, data.unsafeAddress().reinterpret()) }
    override fun getProgramInfoLog(program: Int, bufSize: Int, length: KmlNativeBuffer, infoLog: KmlNativeBuffer): Unit = tempBufferAddress { glGetProgramInfoLog(program, bufSize, length.unsafeAddress().reinterpret(), infoLog.unsafeAddress().reinterpret()) }
    override fun getRenderbufferParameteriv(target: Int, pname: Int, params: KmlNativeBuffer): Unit = tempBufferAddress { glGetRenderbufferParameteriv(target, pname, params.unsafeAddress().reinterpret()) }
    override fun getProgramiv(program: Int, pname: Int, params: KmlNativeBuffer): Unit = tempBufferAddress { glGetProgramiv(program, pname, params.unsafeAddress().reinterpret()) }
    override fun getShaderiv(shader: Int, pname: Int, params: KmlNativeBuffer): Unit = tempBufferAddress { glGetShaderiv(shader, pname, params.unsafeAddress().reinterpret()) }
    override fun getShaderInfoLog(shader: Int, bufSize: Int, length: KmlNativeBuffer, infoLog: KmlNativeBuffer): Unit = tempBufferAddress { glGetShaderInfoLog(shader, bufSize, length.unsafeAddress().reinterpret(), infoLog.unsafeAddress().reinterpret()) }
    override fun getShaderPrecisionFormat(shadertype: Int, precisiontype: Int, range: KmlNativeBuffer, precision: KmlNativeBuffer): Unit = tempBufferAddress { Unit }
    override fun getShaderSource(shader: Int, bufSize: Int, length: KmlNativeBuffer, source: KmlNativeBuffer): Unit = tempBufferAddress { glGetShaderSource(shader, bufSize, length.unsafeAddress().reinterpret(), source.unsafeAddress().reinterpret()) }
    override fun getString(name: Int): String = tempBufferAddress { (glGetString(name))?.toKString() ?: "" }
    override fun getTexParameterfv(target: Int, pname: Int, params: KmlNativeBuffer): Unit = tempBufferAddress { glGetTexParameterfv(target, pname, params.unsafeAddress().reinterpret()) }
    override fun getTexParameteriv(target: Int, pname: Int, params: KmlNativeBuffer): Unit = tempBufferAddress { glGetTexParameteriv(target, pname, params.unsafeAddress().reinterpret()) }
    override fun getUniformfv(program: Int, location: Int, params: KmlNativeBuffer): Unit = tempBufferAddress { glGetUniformfv(program, location, params.unsafeAddress().reinterpret()) }
    override fun getUniformiv(program: Int, location: Int, params: KmlNativeBuffer): Unit = tempBufferAddress { glGetUniformiv(program, location, params.unsafeAddress().reinterpret()) }
    override fun getVertexAttribfv(index: Int, pname: Int, params: KmlNativeBuffer): Unit = tempBufferAddress { glGetVertexAttribfv(index, pname, params.unsafeAddress().reinterpret()) }
    override fun getVertexAttribiv(index: Int, pname: Int, params: KmlNativeBuffer): Unit = tempBufferAddress { glGetVertexAttribiv(index, pname, params.unsafeAddress().reinterpret()) }
    override fun getVertexAttribPointerv(index: Int, pname: Int, pointer: KmlNativeBuffer): Unit = tempBufferAddress { glGetVertexAttribPointerv(index, pname, pointer.unsafeAddress().reinterpret()) }
    override fun hint(target: Int, mode: Int): Unit = tempBufferAddress { glHint(target, mode) }
    override fun isBuffer(buffer: Int): Boolean = tempBufferAddress { glIsBuffer(buffer).toBool() }
    override fun isEnabled(cap: Int): Boolean = tempBufferAddress { glIsEnabled(cap).toBool() }
    override fun isFramebuffer(framebuffer: Int): Boolean = tempBufferAddress { glIsFramebuffer(framebuffer).toBool() }
    override fun isProgram(program: Int): Boolean = tempBufferAddress { glIsProgram(program).toBool() }
    override fun isRenderbuffer(renderbuffer: Int): Boolean = tempBufferAddress { glIsRenderbuffer(renderbuffer).toBool() }
    override fun isShader(shader: Int): Boolean = tempBufferAddress { glIsShader(shader).toBool() }
    override fun isTexture(texture: Int): Boolean = tempBufferAddress { glIsTexture(texture).toBool() }
    override fun lineWidth(width: Float): Unit = tempBufferAddress { glLineWidth(width) }
    override fun linkProgram(program: Int): Unit = tempBufferAddress { glLinkProgram(program) }
    override fun pixelStorei(pname: Int, param: Int): Unit = tempBufferAddress { glPixelStorei(pname, param) }
    override fun polygonOffset(factor: Float, units: Float): Unit = tempBufferAddress { glPolygonOffset(factor, units) }
    override fun readPixels(x: Int, y: Int, width: Int, height: Int, format: Int, type: Int, pixels: KmlNativeBuffer): Unit = tempBufferAddress { glReadPixels(x, y, width, height, format, type, pixels.unsafeAddress().reinterpret()) }
    override fun releaseShaderCompiler(): Unit = tempBufferAddress { Unit }
    override fun renderbufferStorage(target: Int, internalformat: Int, width: Int, height: Int): Unit = tempBufferAddress { glRenderbufferStorage(target, internalformat, width, height) }
    override fun sampleCoverage(value: Float, invert: Boolean): Unit = tempBufferAddress { glSampleCoverage(value, invert.convert()) }
    override fun scissor(x: Int, y: Int, width: Int, height: Int): Unit = tempBufferAddress { glScissor(x, y, width, height) }
    override fun shaderBinary(count: Int, shaders: KmlNativeBuffer, binaryformat: Int, binary: KmlNativeBuffer, length: Int): Unit = tempBufferAddress { throw KmlGlException("shaderBinary not implemented in Native") }
    override fun shaderSource(shader: Int, string: String): Unit = memScoped { tempBufferAddress { run {
                memScoped {
                    val lengths = allocArray<IntVar>(1)
                    val strings = allocArray<CPointerVar<ByteVar>>(1)
                    lengths[0] = strlen(string).convert()
                    strings[0] = string.cstr.placeTo(this)
                    glShaderSource(shader, 1, strings, lengths)
                }
                } } }
    override fun stencilFunc(func: Int, ref: Int, mask: Int): Unit = tempBufferAddress { glStencilFunc(func, ref, mask) }
    override fun stencilFuncSeparate(face: Int, func: Int, ref: Int, mask: Int): Unit = tempBufferAddress { glStencilFuncSeparate(face, func, ref, mask) }
    override fun stencilMask(mask: Int): Unit = tempBufferAddress { glStencilMask(mask) }
    override fun stencilMaskSeparate(face: Int, mask: Int): Unit = tempBufferAddress { glStencilMaskSeparate(face, mask) }
    override fun stencilOp(fail: Int, zfail: Int, zpass: Int): Unit = tempBufferAddress { glStencilOp(fail, zfail, zpass) }
    override fun stencilOpSeparate(face: Int, sfail: Int, dpfail: Int, dppass: Int): Unit = tempBufferAddress { glStencilOpSeparate(face, sfail, dpfail, dppass) }
    override fun texImage2D(target: Int, level: Int, internalformat: Int, width: Int, height: Int, border: Int, format: Int, type: Int, pixels: KmlNativeBuffer?): Unit = tempBufferAddress { glTexImage2D(target, level, internalformat, width, height, border, format, type, pixels?.unsafeAddress()?.reinterpret()) }
    override fun texImage2D(target: Int, level: Int, internalformat: Int, format: Int, type: Int, data: NativeImage): Unit = tempBufferAddress { run { val intData = (data as BitmapNativeImage).intData; if (intData != null) {	intData.usePinned { dataPin -> glTexImage2D(target, level, internalformat, data.width, data.height, 0, format, type, dataPin.addressOf(0).reinterpret()) }} else {	glTexImage2D(target, level, internalformat, data.width, data.height, 0, format, type, null)}} }
    override fun texParameterf(target: Int, pname: Int, param: Float): Unit = tempBufferAddress { glTexParameterf(target, pname, param) }
    override fun texParameterfv(target: Int, pname: Int, params: KmlNativeBuffer): Unit = tempBufferAddress { glTexParameterfv(target, pname, params.unsafeAddress().reinterpret()) }
    override fun texParameteri(target: Int, pname: Int, param: Int): Unit = tempBufferAddress { glTexParameteri(target, pname, param) }
    override fun texParameteriv(target: Int, pname: Int, params: KmlNativeBuffer): Unit = tempBufferAddress { glTexParameteriv(target, pname, params.unsafeAddress().reinterpret()) }
    override fun texSubImage2D(target: Int, level: Int, xoffset: Int, yoffset: Int, width: Int, height: Int, format: Int, type: Int, pixels: KmlNativeBuffer): Unit = tempBufferAddress { glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels.unsafeAddress().reinterpret()) }
    override fun uniform1f(location: Int, v0: Float): Unit = tempBufferAddress { glUniform1f(location, v0) }
    override fun uniform1fv(location: Int, count: Int, value: KmlNativeBuffer): Unit = tempBufferAddress { glUniform1fv(location, count, value.unsafeAddress().reinterpret()) }
    override fun uniform1i(location: Int, v0: Int): Unit = tempBufferAddress { glUniform1i(location, v0) }
    override fun uniform1iv(location: Int, count: Int, value: KmlNativeBuffer): Unit = tempBufferAddress { glUniform1iv(location, count, value.unsafeAddress().reinterpret()) }
    override fun uniform2f(location: Int, v0: Float, v1: Float): Unit = tempBufferAddress { glUniform2f(location, v0, v1) }
    override fun uniform2fv(location: Int, count: Int, value: KmlNativeBuffer): Unit = tempBufferAddress { glUniform2fv(location, count, value.unsafeAddress().reinterpret()) }
    override fun uniform2i(location: Int, v0: Int, v1: Int): Unit = tempBufferAddress { glUniform2i(location, v0, v1) }
    override fun uniform2iv(location: Int, count: Int, value: KmlNativeBuffer): Unit = tempBufferAddress { glUniform2iv(location, count, value.unsafeAddress().reinterpret()) }
    override fun uniform3f(location: Int, v0: Float, v1: Float, v2: Float): Unit = tempBufferAddress { glUniform3f(location, v0, v1, v2) }
    override fun uniform3fv(location: Int, count: Int, value: KmlNativeBuffer): Unit = tempBufferAddress { glUniform3fv(location, count, value.unsafeAddress().reinterpret()) }
    override fun uniform3i(location: Int, v0: Int, v1: Int, v2: Int): Unit = tempBufferAddress { glUniform3i(location, v0, v1, v2) }
    override fun uniform3iv(location: Int, count: Int, value: KmlNativeBuffer): Unit = tempBufferAddress { glUniform3iv(location, count, value.unsafeAddress().reinterpret()) }
    override fun uniform4f(location: Int, v0: Float, v1: Float, v2: Float, v3: Float): Unit = tempBufferAddress { glUniform4f(location, v0, v1, v2, v3) }
    override fun uniform4fv(location: Int, count: Int, value: KmlNativeBuffer): Unit = tempBufferAddress { glUniform4fv(location, count, value.unsafeAddress().reinterpret()) }
    override fun uniform4i(location: Int, v0: Int, v1: Int, v2: Int, v3: Int): Unit = tempBufferAddress { glUniform4i(location, v0, v1, v2, v3) }
    override fun uniform4iv(location: Int, count: Int, value: KmlNativeBuffer): Unit = tempBufferAddress { glUniform4iv(location, count, value.unsafeAddress().reinterpret()) }
    override fun uniformMatrix2fv(location: Int, count: Int, transpose: Boolean, value: KmlNativeBuffer): Unit = tempBufferAddress { glUniformMatrix2fv(location, count, transpose.convert(), value.unsafeAddress().reinterpret()) }
    override fun uniformMatrix3fv(location: Int, count: Int, transpose: Boolean, value: KmlNativeBuffer): Unit = tempBufferAddress { glUniformMatrix3fv(location, count, transpose.convert(), value.unsafeAddress().reinterpret()) }
    override fun uniformMatrix4fv(location: Int, count: Int, transpose: Boolean, value: KmlNativeBuffer): Unit = tempBufferAddress { glUniformMatrix4fv(location, count, transpose.convert(), value.unsafeAddress().reinterpret()) }
    override fun useProgram(program: Int): Unit = tempBufferAddress { glUseProgram(program) }
    override fun validateProgram(program: Int): Unit = tempBufferAddress { glValidateProgram(program) }
    override fun vertexAttrib1f(index: Int, x: Float): Unit = tempBufferAddress { glVertexAttrib1f(index, x) }
    override fun vertexAttrib1fv(index: Int, v: KmlNativeBuffer): Unit = tempBufferAddress { glVertexAttrib1fv(index, v.unsafeAddress().reinterpret()) }
    override fun vertexAttrib2f(index: Int, x: Float, y: Float): Unit = tempBufferAddress { glVertexAttrib2f(index, x, y) }
    override fun vertexAttrib2fv(index: Int, v: KmlNativeBuffer): Unit = tempBufferAddress { glVertexAttrib2fv(index, v.unsafeAddress().reinterpret()) }
    override fun vertexAttrib3f(index: Int, x: Float, y: Float, z: Float): Unit = tempBufferAddress { glVertexAttrib3f(index, x, y, z) }
    override fun vertexAttrib3fv(index: Int, v: KmlNativeBuffer): Unit = tempBufferAddress { glVertexAttrib3fv(index, v.unsafeAddress().reinterpret()) }
    override fun vertexAttrib4f(index: Int, x: Float, y: Float, z: Float, w: Float): Unit = tempBufferAddress { glVertexAttrib4f(index, x, y, z, w) }
    override fun vertexAttrib4fv(index: Int, v: KmlNativeBuffer): Unit = tempBufferAddress { glVertexAttrib4fv(index, v.unsafeAddress().reinterpret()) }
    override fun vertexAttribPointer(index: Int, size: Int, type: Int, normalized: Boolean, stride: Int, pointer: Int): Unit = tempBufferAddress { glVertexAttribPointer(index, size, type, normalized.convert(), stride, pointer.reinterpret()) }
    override fun viewport(x: Int, y: Int, width: Int, height: Int): Unit = tempBufferAddress { glViewport(x, y, width, height) }
}
