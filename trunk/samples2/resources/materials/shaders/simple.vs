attribute vec3 _Position;

uniform mat4 u_WorldViewProj;

void main()
{
  gl_Position = u_WorldViewProj * vec4(_Position,1.0);
}