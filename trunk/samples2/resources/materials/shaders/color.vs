attribute vec3 _Position;
attribute vec4 _Color;

varying vec4 v_Color;

uniform mat4 u_WorldViewProj;

void main()
{
  gl_Position = u_WorldViewProj * vec4(_Position,1.0);
  v_Color = _Color;
}