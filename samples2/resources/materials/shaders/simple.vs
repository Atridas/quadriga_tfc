attribute vec3 _Position;

uniform mat4 u_WorldViewProj;

void main()
{
  gl_Position = u_WorldViewProj * _Position;
}