/*
 * Copyright 2017 Google LLC
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

package app.tivi.showdetails.details.model

import androidx.compose.runtime.Immutable
import app.tivi.data.entities.Genre
import app.tivi.data.entities.ShowStatus
import org.threeten.bp.DayOfWeek
import org.threeten.bp.LocalTime
import org.threeten.bp.ZoneId

@Immutable
internal data class ShowUiModel(
    val id: Long = 0,
    val title: String? = null,
    val summary: String? = null,
    val traktRating: Float? = null,
    val traktVotes: Int? = null,
    val certification: String? = null,
    val network: String? = null,
    val networkLogoPath: String? = null,
    val runtime: Int? = null,
    val status: ShowStatus? = null,
    val airsDay: DayOfWeek? = null,
    val airsTime: LocalTime? = null,
    val airsTimeZone: ZoneId? = null,
    val genres: List<Genre> = emptyList(),
)
