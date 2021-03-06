/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.fineract.cn.portfolio.api.v1;

/**
 * @author Myrle Krantz
 */
@SuppressWarnings("unused")
public interface PermittableGroupIds {
  String PRODUCT_OPERATIONS_MANAGEMENT = "portfolio__v1__products__enable";
  String PRODUCT_LOSS_PROVISIONING_MANAGEMENT = "portfolio__v1__products__lossprv";
  String PRODUCT_MANAGEMENT = "portfolio__v1__products";
  String CASE_MANAGEMENT = "portfolio__v1__case";
  String CASE_DOCUMENT_MANAGEMENT = "portfolio__v1__case_documents";
  String CASE_STATUS = "portfolio__v1__case_status";
}
