/**
 * Copyright 2015 Mohiva Organisation (license at mohiva dot com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.mohiva.play.silhouette.impl.exceptions

import com.mohiva.play.silhouette.api.exceptions.ProviderException

/**
 * Indicates that an error occurred during OAuth2 state retrieval.
 *
 * @param msg The exception message.
 * @param cause The exception cause.
 */
class OAuth2StateException(msg: String, cause: Throwable = null)
  extends ProviderException(msg, cause)