/*****************************************************************************
 * Copyright (C) jparsec.org                                                *
 * ------------------------------------------------------------------------- *
 * Licensed under the Apache License, Version 2.0 (the "License");           *
 * you may not use this file except in compliance with the License.          *
 * You may obtain a copy of the License at                                   *
 *                                                                           *
 * http://www.apache.org/licenses/LICENSE-2.0                                *
 *                                                                           *
 * Unless required by applicable law or agreed to in writing, software       *
 * distributed under the License is distributed on an "AS IS" BASIS,         *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  *
 * See the License for the specific language governing permissions and       *
 * limitations under the License.                                            *
 *****************************************************************************/
package com.movesol.jparsec.functors;

import com.movesol.jparsec.internal.util.Objects;

/**
 * Immutable data holder for 8 values.
 * 
 * @author Ben Yu
 */
public class Tuple8<A, B, C, D, E, F, G, H> extends Tuple7<A, B, C, D, E, F, G>{
  
  public final H h;
  
  public Tuple8(A a, B b, C c, D d, E e, F f, G g, H h) {
    super(a, b, c, d, e, f, g);
    this.h = h;
  }
  
  boolean equals(Tuple8<?, ?, ?, ?, ?, ?, ?, ?> other) {
    return super.equals(other) && Objects.equals(h, other.h);
  }
  
  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Tuple8<?, ?, ?, ?, ?, ?, ?, ?>) {
      return equals((Tuple8<?, ?, ?, ?, ?, ?, ?, ?>) obj);
    }
    return false;
  }
  
  @Override
  public int hashCode() {
    return super.hashCode() * 31 + Objects.hashCode(g);
  }
  
  @Override
  public String toString() {
    return "(" + a + ", " + b + ", " + c + ", " + d + ", " + e + ", " + f + ", " + g + ", " + h + ")";
  }
  
	public <T> T map(Map8<A, B, C, D, E, F, G, H, T> map) {
		return map.map(a, b, c, d, e, f, g, h);
	}

}