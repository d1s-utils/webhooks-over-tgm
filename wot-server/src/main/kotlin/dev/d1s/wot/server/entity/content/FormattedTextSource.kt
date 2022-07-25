/*
 * Copyright 2022 Webhooks over Telegram project contributors
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

package dev.d1s.wot.server.entity.content

import javax.validation.Valid
import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotNull

@Suppress("CanBePrimaryConstructorProperty")
class FormattedTextSource(
    type: FormattedTextSourceType,
    value: String,
    subsources: List<FormattedTextSource>
) {
    @NotNull
    val type: FormattedTextSourceType = type

    @NotBlank
    val value: String = value

    @NotNull
    val subsources: List<@Valid FormattedTextSource> = subsources
}
