/*
 * Licensed by the authors under the Creative Commons
 * Attribution-ShareAlike 2.0 Generic (CC BY-SA 2.0)
 * License:
 *
 * http://creativecommons.org/licenses/by-sa/2.0/
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.cedj.geekseek.domain.relation.test;

import org.cedj.geekseek.domain.relation.RelationRepository;
import org.cedj.geekseek.domain.relation.model.Relation;
import org.cedj.geekseek.domain.test.CoreDeployments;
import org.jboss.shrinkwrap.api.spec.JavaArchive;

public class RelationDeployments {
    public static JavaArchive relation() {
        return CoreDeployments.core().addPackage(Relation.class.getPackage())
            .addPackage(RelationRepository.class.getPackage());
    }
}