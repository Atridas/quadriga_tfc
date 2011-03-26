varying vec2 v_ST;

uniform sampler2D u_Tex;

void main(void) {
  gl_FragColor = texture2D(u_Tex,v_ST);
  //gl_FragColor = vec4(v_ST.rg, 0, 1);
}