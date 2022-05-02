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
    as = ImmutableSpecimen_Collection.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Specimen_Collection {
  Optional<String> id();

  Optional<CodeableConcept> fastingStatusCodeableConcept();

  Optional<CodeableConcept> bodySite();

  Optional<List<Extension>> modifierExtension();

  Optional<String> collectedDateTime();

  Optional<List<Extension>> extension();

  Optional<CodeableConcept> method();

  Optional<Period> collectedPeriod();

  Optional<Reference> collector();

  Optional<Duration> duration();

  Optional<Duration> fastingStatusDuration();

  Optional<Quantity> quantity();

  static ImmutableSpecimen_Collection.Builder builder() {
    return ImmutableSpecimen_Collection.builder();
  }
}
