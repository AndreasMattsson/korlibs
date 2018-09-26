// WARNING: File autogenerated DO NOT modify
// https://www.khronos.org/registry/OpenGL/api/GLES2/gl2.h
@file:Suppress("unused", "RedundantUnitReturnType", "PropertyName")

package com.soywiz.kgl

import android.opengl.GLES20.*
import com.soywiz.kmem.*
import com.soywiz.korim.bitmap.*

class KmlGlAndroid : KmlGl() {
    override fun activeTexture(texture: Int): Unit = glActiveTexture(texture)
    override fun attachShader(program: Int, shader: Int): Unit = glAttachShader(program, shader)
    override fun bindAttribLocation(program: Int, index: Int, name: String): Unit = glBindAttribLocation(program, index, name)
    override fun bindBuffer(target: Int, buffer: Int): Unit = glBindBuffer(target, buffer)
    override fun bindFramebuffer(target: Int, framebuffer: Int): Unit = glBindFramebuffer(target, framebuffer)
    override fun bindRenderbuffer(target: Int, renderbuffer: Int): Unit = glBindRenderbuffer(target, renderbuffer)
    override fun bindTexture(target: Int, texture: Int): Unit = glBindTexture(target, texture)
    override fun blendColor(red: Float, green: Float, blue: Float, alpha: Float): Unit = glBlendColor(red, green, blue, alpha)
    override fun blendEquation(mode: Int): Unit = glBlendEquation(mode)
    override fun blendEquationSeparate(modeRGB: Int, modeAlpha: Int): Unit = glBlendEquationSeparate(modeRGB, modeAlpha)
    override fun blendFunc(sfactor: Int, dfactor: Int): Unit = glBlendFunc(sfactor, dfactor)
    override fun blendFuncSeparate(sfactorRGB: Int, dfactorRGB: Int, sfactorAlpha: Int, dfactorAlpha: Int): Unit = glBlendFuncSeparate(sfactorRGB, dfactorRGB, sfactorAlpha, dfactorAlpha)
    override fun bufferData(target: Int, size: Int, data: KmlNativeBuffer, usage: Int): Unit = glBufferData(target, size, data.nioBuffer, usage)
    override fun bufferSubData(target: Int, offset: Int, size: Int, data: KmlNativeBuffer): Unit = glBufferSubData(target, offset, size, data.nioBuffer)
    override fun checkFramebufferStatus(target: Int): Int = glCheckFramebufferStatus(target)
    override fun clear(mask: Int): Unit = glClear(mask)
    override fun clearColor(red: Float, green: Float, blue: Float, alpha: Float): Unit = glClearColor(red, green, blue, alpha)
    override fun clearDepthf(d: Float): Unit = glClearDepthf(d)
    override fun clearStencil(s: Int): Unit = glClearStencil(s)
    override fun colorMask(red: Boolean, green: Boolean, blue: Boolean, alpha: Boolean): Unit = glColorMask(red, green, blue, alpha)
    override fun compileShader(shader: Int): Unit = glCompileShader(shader)
    override fun compressedTexImage2D(target: Int, level: Int, internalformat: Int, width: Int, height: Int, border: Int, imageSize: Int, data: KmlNativeBuffer): Unit = glCompressedTexImage2D(target, level, internalformat, width, height, border, imageSize, data.nioBuffer)
    override fun compressedTexSubImage2D(target: Int, level: Int, xoffset: Int, yoffset: Int, width: Int, height: Int, format: Int, imageSize: Int, data: KmlNativeBuffer): Unit = glCompressedTexSubImage2D(target, level, xoffset, yoffset, width, height, format, imageSize, data.nioBuffer)
    override fun copyTexImage2D(target: Int, level: Int, internalformat: Int, x: Int, y: Int, width: Int, height: Int, border: Int): Unit = glCopyTexImage2D(target, level, internalformat, x, y, width, height, border)
    override fun copyTexSubImage2D(target: Int, level: Int, xoffset: Int, yoffset: Int, x: Int, y: Int, width: Int, height: Int): Unit = glCopyTexSubImage2D(target, level, xoffset, yoffset, x, y, width, height)
    override fun createProgram(): Int = glCreateProgram()
    override fun createShader(type: Int): Int = glCreateShader(type)
    override fun cullFace(mode: Int): Unit = glCullFace(mode)
    override fun deleteBuffers(n: Int, items: KmlNativeBuffer): Unit = glDeleteBuffers(n, items.nioIntBuffer)
    override fun deleteFramebuffers(n: Int, items: KmlNativeBuffer): Unit = glDeleteFramebuffers(n, items.nioIntBuffer)
    override fun deleteProgram(program: Int): Unit = glDeleteProgram(program)
    override fun deleteRenderbuffers(n: Int, items: KmlNativeBuffer): Unit = glDeleteRenderbuffers(n, items.nioIntBuffer)
    override fun deleteShader(shader: Int): Unit = glDeleteShader(shader)
    override fun deleteTextures(n: Int, items: KmlNativeBuffer): Unit = glDeleteTextures(n, items.nioIntBuffer)
    override fun depthFunc(func: Int): Unit = glDepthFunc(func)
    override fun depthMask(flag: Boolean): Unit = glDepthMask(flag)
    override fun depthRangef(n: Float, f: Float): Unit = glDepthRangef(n, f)
    override fun detachShader(program: Int, shader: Int): Unit = glDetachShader(program, shader)
    override fun disable(cap: Int): Unit = glDisable(cap)
    override fun disableVertexAttribArray(index: Int): Unit = glDisableVertexAttribArray(index)
    override fun drawArrays(mode: Int, first: Int, count: Int): Unit = glDrawArrays(mode, first, count)
    override fun drawElements(mode: Int, count: Int, type: Int, indices: Int): Unit = glDrawElements(mode, count, type, indices)
    override fun enable(cap: Int): Unit = glEnable(cap)
    override fun enableVertexAttribArray(index: Int): Unit = glEnableVertexAttribArray(index)
    override fun finish(): Unit = glFinish()
    override fun flush(): Unit = glFlush()
    override fun framebufferRenderbuffer(target: Int, attachment: Int, renderbuffertarget: Int, renderbuffer: Int): Unit = glFramebufferRenderbuffer(target, attachment, renderbuffertarget, renderbuffer)
    override fun framebufferTexture2D(target: Int, attachment: Int, textarget: Int, texture: Int, level: Int): Unit = glFramebufferTexture2D(target, attachment, textarget, texture, level)
    override fun frontFace(mode: Int): Unit = glFrontFace(mode)
    override fun genBuffers(n: Int, buffers: KmlNativeBuffer): Unit = glGenBuffers(n, buffers.nioIntBuffer)
    override fun generateMipmap(target: Int): Unit = glGenerateMipmap(target)
    override fun genFramebuffers(n: Int, framebuffers: KmlNativeBuffer): Unit = glGenFramebuffers(n, framebuffers.nioIntBuffer)
    override fun genRenderbuffers(n: Int, renderbuffers: KmlNativeBuffer): Unit = glGenRenderbuffers(n, renderbuffers.nioIntBuffer)
    override fun genTextures(n: Int, textures: KmlNativeBuffer): Unit = glGenTextures(n, textures.nioIntBuffer)
    override fun getActiveAttrib(program: Int, index: Int, bufSize: Int, length: KmlNativeBuffer, size: KmlNativeBuffer, type: KmlNativeBuffer, name: KmlNativeBuffer): Unit = run { val alen = IntArray(1) ; val asize = IntArray(1) ; val atype = IntArray(1) ; val aname = ByteArray(name.size); glGetActiveAttrib(program, index, bufSize, alen, 0, asize, 0, atype, 0, aname, 0); length.setInt(0, alen[0]); size.setInt(0, asize[0]); type.setInt(0, atype[0]); name.putAsciiString(aname.toString(Charsets.US_ASCII)) }
    override fun getActiveUniform(program: Int, index: Int, bufSize: Int, length: KmlNativeBuffer, size: KmlNativeBuffer, type: KmlNativeBuffer, name: KmlNativeBuffer): Unit = run { val alen = IntArray(1) ; val asize = IntArray(1) ; val atype = IntArray(1) ; val aname = ByteArray(name.size); glGetActiveUniform(program, index, bufSize, alen, 0, asize, 0, atype, 0, aname, 0); length.setInt(0, alen[0]); size.setInt(0, asize[0]); type.setInt(0, atype[0]); name.putAsciiString(aname.toString(Charsets.US_ASCII)) }
    override fun getAttachedShaders(program: Int, maxCount: Int, count: KmlNativeBuffer, shaders: KmlNativeBuffer): Unit = glGetAttachedShaders(program, maxCount, count.nioIntBuffer, shaders.nioIntBuffer)
    override fun getAttribLocation(program: Int, name: String): Int = glGetAttribLocation(program, name)
    override fun getUniformLocation(program: Int, name: String): Int = glGetUniformLocation(program, name)
    override fun getBooleanv(pname: Int, data: KmlNativeBuffer): Unit = glGetBooleanv(pname, data.nioIntBuffer)
    override fun getBufferParameteriv(target: Int, pname: Int, params: KmlNativeBuffer): Unit = glGetBufferParameteriv(target, pname, params.nioIntBuffer)
    override fun getError(): Int = glGetError()
    override fun getFloatv(pname: Int, data: KmlNativeBuffer): Unit = glGetFloatv(pname, data.nioFloatBuffer)
    override fun getFramebufferAttachmentParameteriv(target: Int, attachment: Int, pname: Int, params: KmlNativeBuffer): Unit = glGetFramebufferAttachmentParameteriv(target, attachment, pname, params.nioIntBuffer)
    override fun getIntegerv(pname: Int, data: KmlNativeBuffer): Unit = glGetIntegerv(pname, data.nioIntBuffer)
    override fun getProgramInfoLog(program: Int, bufSize: Int, length: KmlNativeBuffer, infoLog: KmlNativeBuffer): Unit = run { infoLog.putAsciiString(glGetProgramInfoLog(program)) }
    override fun getRenderbufferParameteriv(target: Int, pname: Int, params: KmlNativeBuffer): Unit = glGetRenderbufferParameteriv(target, pname, params.nioIntBuffer)
    override fun getProgramiv(program: Int, pname: Int, params: KmlNativeBuffer): Unit = glGetProgramiv(program, pname, params.nioIntBuffer)
    override fun getShaderiv(shader: Int, pname: Int, params: KmlNativeBuffer): Unit = glGetShaderiv(shader, pname, params.nioIntBuffer)
    override fun getShaderInfoLog(shader: Int, bufSize: Int, length: KmlNativeBuffer, infoLog: KmlNativeBuffer): Unit = run { infoLog.putAsciiString(glGetShaderInfoLog(shader)) }
    override fun getShaderPrecisionFormat(shadertype: Int, precisiontype: Int, range: KmlNativeBuffer, precision: KmlNativeBuffer): Unit = glGetShaderPrecisionFormat(shadertype, precisiontype, range.nioIntBuffer, precision.nioIntBuffer)
    override fun getShaderSource(shader: Int, bufSize: Int, length: KmlNativeBuffer, source: KmlNativeBuffer): Unit = run { val len = IntArray(1); glGetShaderiv(shader, GL_SHADER_SOURCE_LENGTH, len, 0); val src = ByteArray(len[0]); glGetShaderSource(shader, bufSize, len, 0, src, 0); source.putAsciiString(src.toString(Charsets.US_ASCII)) }
    override fun getString(name: Int): String = glGetString(name)
    override fun getTexParameterfv(target: Int, pname: Int, params: KmlNativeBuffer): Unit = glGetTexParameterfv(target, pname, params.nioFloatBuffer)
    override fun getTexParameteriv(target: Int, pname: Int, params: KmlNativeBuffer): Unit = glGetTexParameteriv(target, pname, params.nioIntBuffer)
    override fun getUniformfv(program: Int, location: Int, params: KmlNativeBuffer): Unit = glGetUniformfv(program, location, params.nioFloatBuffer)
    override fun getUniformiv(program: Int, location: Int, params: KmlNativeBuffer): Unit = glGetUniformiv(program, location, params.nioIntBuffer)
    override fun getVertexAttribfv(index: Int, pname: Int, params: KmlNativeBuffer): Unit = glGetVertexAttribfv(index, pname, params.nioFloatBuffer)
    override fun getVertexAttribiv(index: Int, pname: Int, params: KmlNativeBuffer): Unit = glGetVertexAttribiv(index, pname, params.nioIntBuffer)
    override fun getVertexAttribPointerv(index: Int, pname: Int, pointer: KmlNativeBuffer): Unit = TODO()
    override fun hint(target: Int, mode: Int): Unit = glHint(target, mode)
    override fun isBuffer(buffer: Int): Boolean = glIsBuffer(buffer)
    override fun isEnabled(cap: Int): Boolean = glIsEnabled(cap)
    override fun isFramebuffer(framebuffer: Int): Boolean = glIsFramebuffer(framebuffer)
    override fun isProgram(program: Int): Boolean = glIsProgram(program)
    override fun isRenderbuffer(renderbuffer: Int): Boolean = glIsRenderbuffer(renderbuffer)
    override fun isShader(shader: Int): Boolean = glIsShader(shader)
    override fun isTexture(texture: Int): Boolean = glIsTexture(texture)
    override fun lineWidth(width: Float): Unit = glLineWidth(width)
    override fun linkProgram(program: Int): Unit = glLinkProgram(program)
    override fun pixelStorei(pname: Int, param: Int): Unit = glPixelStorei(pname, param)
    override fun polygonOffset(factor: Float, units: Float): Unit = glPolygonOffset(factor, units)
    override fun readPixels(x: Int, y: Int, width: Int, height: Int, format: Int, type: Int, pixels: KmlNativeBuffer): Unit = glReadPixels(x, y, width, height, format, type, pixels.nioBuffer)
    override fun releaseShaderCompiler(): Unit = glReleaseShaderCompiler()
    override fun renderbufferStorage(target: Int, internalformat: Int, width: Int, height: Int): Unit = glRenderbufferStorage(target, internalformat, width, height)
    override fun sampleCoverage(value: Float, invert: Boolean): Unit = glSampleCoverage(value, invert)
    override fun scissor(x: Int, y: Int, width: Int, height: Int): Unit = glScissor(x, y, width, height)
    override fun shaderBinary(count: Int, shaders: KmlNativeBuffer, binaryformat: Int, binary: KmlNativeBuffer, length: Int): Unit = glShaderBinary(count, shaders.nioIntBuffer, binaryformat, binary.nioBuffer, length)
    override fun shaderSource(shader: Int, string: String): Unit = glShaderSource(shader, string)
    override fun stencilFunc(func: Int, ref: Int, mask: Int): Unit = glStencilFunc(func, ref, mask)
    override fun stencilFuncSeparate(face: Int, func: Int, ref: Int, mask: Int): Unit = glStencilFuncSeparate(face, func, ref, mask)
    override fun stencilMask(mask: Int): Unit = glStencilMask(mask)
    override fun stencilMaskSeparate(face: Int, mask: Int): Unit = glStencilMaskSeparate(face, mask)
    override fun stencilOp(fail: Int, zfail: Int, zpass: Int): Unit = glStencilOp(fail, zfail, zpass)
    override fun stencilOpSeparate(face: Int, sfail: Int, dpfail: Int, dppass: Int): Unit = glStencilOpSeparate(face, sfail, dpfail, dppass)
    override fun texImage2D(target: Int, level: Int, internalformat: Int, width: Int, height: Int, border: Int, format: Int, type: Int, pixels: KmlNativeBuffer?): Unit = glTexImage2D(target, level, internalformat, width, height, border, format, type, pixels.nioBuffer)
    override fun texImage2D(target: Int, level: Int, internalformat: Int, format: Int, type: Int, data: NativeImage): Unit = TODO()
    override fun texParameterf(target: Int, pname: Int, param: Float): Unit = glTexParameterf(target, pname, param)
    override fun texParameterfv(target: Int, pname: Int, params: KmlNativeBuffer): Unit = glTexParameterfv(target, pname, params.nioFloatBuffer)
    override fun texParameteri(target: Int, pname: Int, param: Int): Unit = glTexParameteri(target, pname, param)
    override fun texParameteriv(target: Int, pname: Int, params: KmlNativeBuffer): Unit = glTexParameteriv(target, pname, params.nioIntBuffer)
    override fun texSubImage2D(target: Int, level: Int, xoffset: Int, yoffset: Int, width: Int, height: Int, format: Int, type: Int, pixels: KmlNativeBuffer): Unit = glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels.nioBuffer)
    override fun uniform1f(location: Int, v0: Float): Unit = glUniform1f(location, v0)
    override fun uniform1fv(location: Int, count: Int, value: KmlNativeBuffer): Unit = glUniform1fv(location, count, value.nioFloatBuffer)
    override fun uniform1i(location: Int, v0: Int): Unit = glUniform1i(location, v0)
    override fun uniform1iv(location: Int, count: Int, value: KmlNativeBuffer): Unit = glUniform1iv(location, count, value.nioIntBuffer)
    override fun uniform2f(location: Int, v0: Float, v1: Float): Unit = glUniform2f(location, v0, v1)
    override fun uniform2fv(location: Int, count: Int, value: KmlNativeBuffer): Unit = glUniform2fv(location, count, value.nioFloatBuffer)
    override fun uniform2i(location: Int, v0: Int, v1: Int): Unit = glUniform2i(location, v0, v1)
    override fun uniform2iv(location: Int, count: Int, value: KmlNativeBuffer): Unit = glUniform2iv(location, count, value.nioIntBuffer)
    override fun uniform3f(location: Int, v0: Float, v1: Float, v2: Float): Unit = glUniform3f(location, v0, v1, v2)
    override fun uniform3fv(location: Int, count: Int, value: KmlNativeBuffer): Unit = glUniform3fv(location, count, value.nioFloatBuffer)
    override fun uniform3i(location: Int, v0: Int, v1: Int, v2: Int): Unit = glUniform3i(location, v0, v1, v2)
    override fun uniform3iv(location: Int, count: Int, value: KmlNativeBuffer): Unit = glUniform3iv(location, count, value.nioIntBuffer)
    override fun uniform4f(location: Int, v0: Float, v1: Float, v2: Float, v3: Float): Unit = glUniform4f(location, v0, v1, v2, v3)
    override fun uniform4fv(location: Int, count: Int, value: KmlNativeBuffer): Unit = glUniform4fv(location, count, value.nioFloatBuffer)
    override fun uniform4i(location: Int, v0: Int, v1: Int, v2: Int, v3: Int): Unit = glUniform4i(location, v0, v1, v2, v3)
    override fun uniform4iv(location: Int, count: Int, value: KmlNativeBuffer): Unit = glUniform4iv(location, count, value.nioIntBuffer)
    override fun uniformMatrix2fv(location: Int, count: Int, transpose: Boolean, value: KmlNativeBuffer): Unit = glUniformMatrix2fv(location, count, transpose, value.nioFloatBuffer)
    override fun uniformMatrix3fv(location: Int, count: Int, transpose: Boolean, value: KmlNativeBuffer): Unit = glUniformMatrix3fv(location, count, transpose, value.nioFloatBuffer)
    override fun uniformMatrix4fv(location: Int, count: Int, transpose: Boolean, value: KmlNativeBuffer): Unit = glUniformMatrix4fv(location, count, transpose, value.nioFloatBuffer)
    override fun useProgram(program: Int): Unit = glUseProgram(program)
    override fun validateProgram(program: Int): Unit = glValidateProgram(program)
    override fun vertexAttrib1f(index: Int, x: Float): Unit = glVertexAttrib1f(index, x)
    override fun vertexAttrib1fv(index: Int, v: KmlNativeBuffer): Unit = glVertexAttrib1fv(index, v.nioFloatBuffer)
    override fun vertexAttrib2f(index: Int, x: Float, y: Float): Unit = glVertexAttrib2f(index, x, y)
    override fun vertexAttrib2fv(index: Int, v: KmlNativeBuffer): Unit = glVertexAttrib2fv(index, v.nioFloatBuffer)
    override fun vertexAttrib3f(index: Int, x: Float, y: Float, z: Float): Unit = glVertexAttrib3f(index, x, y, z)
    override fun vertexAttrib3fv(index: Int, v: KmlNativeBuffer): Unit = glVertexAttrib3fv(index, v.nioFloatBuffer)
    override fun vertexAttrib4f(index: Int, x: Float, y: Float, z: Float, w: Float): Unit = glVertexAttrib4f(index, x, y, z, w)
    override fun vertexAttrib4fv(index: Int, v: KmlNativeBuffer): Unit = glVertexAttrib4fv(index, v.nioFloatBuffer)
    override fun vertexAttribPointer(index: Int, size: Int, type: Int, normalized: Boolean, stride: Int, pointer: Int): Unit = glVertexAttribPointer(index, size, type, normalized, stride, pointer)
    override fun viewport(x: Int, y: Int, width: Int, height: Int): Unit = glViewport(x, y, width, height)
}
