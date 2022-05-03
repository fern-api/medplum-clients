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
    as = ImmutableEncounter_Location.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Encounter_Location {
  Optional<List<Extension>> extension();

  Optional<CodeableConcept> physicalType();

  Optional<Encounter_locationStatus> status();

  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  Reference location();

  Optional<Period> period();

  static ImmutableEncounter_Location.LocationBuildStage builder() {
    return ImmutableEncounter_Location.builder();
  }
}
