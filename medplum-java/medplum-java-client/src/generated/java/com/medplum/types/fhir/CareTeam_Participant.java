package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableCareTeam_Participant.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface CareTeam_Participant {
  Optional<String> id();

  Optional<List<CodeableConcept>> role();

  Optional<List<Extension>> modifierExtension();

  Optional<Reference> onBehalfOf();

  Optional<Period> period();

  Optional<List<Extension>> extension();

  Optional<Reference> member();

  static ImmutableCareTeam_Participant.Builder builder() {
    return ImmutableCareTeam_Participant.builder();
  }
}
