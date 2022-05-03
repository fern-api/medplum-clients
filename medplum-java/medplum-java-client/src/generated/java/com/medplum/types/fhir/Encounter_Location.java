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
  Reference location();

  Optional<String> id();

  Optional<CodeableConcept> physicalType();

  Optional<Encounter_locationStatus> status();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<Period> period();

  static ImmutableEncounter_Location.LocationBuildStage builder() {
    return ImmutableEncounter_Location.builder();
  }
}
