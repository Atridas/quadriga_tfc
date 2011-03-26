attribute vec3 _Position;
attribute vec2 _ST;

varying vec4 v_Color;
varying vec2 v_ST;

uniform mat4 u_WorldViewProj;

void main()
{
  gl_Position = u_WorldViewProj * vec4(_Position,1.0);
  v_ST = _ST;
}