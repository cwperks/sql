/*
 * Copyright OpenSearch Contributors
 * SPDX-License-Identifier: Apache-2.0
 */

package org.opensearch.sql.calcite.standalone;

import org.opensearch.sql.common.setting.Settings;

public class CalcitePPLExistsSubqueryPushdownIT extends CalcitePPLExistsSubqueryIT {

  @Override
  protected Settings getSettings() {
    return enablePushdown();
  }
}
