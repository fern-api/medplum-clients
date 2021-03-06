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
    as = ImmutableEncounter_Participant.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Encounter_Participant {
  Optional<List<Extension>> extension();

  Optional<List<CodeableConcept>> type();

  Optional<Reference> individual();

  Optional<List<Extension>> modifierExtension();

  Optional<String> id();

  Optional<Period> period();

  static ImmutableEncounter_Participant.Builder builder() {
    return ImmutableEncounter_Participant.builder();
  }
}
