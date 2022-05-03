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
  Optional<CodeableConcept> bodySite();

  Optional<Quantity> quantity();

  Optional<String> collectedDateTime();

  Optional<Duration> fastingStatusDuration();

  Optional<Period> collectedPeriod();

  Optional<Reference> collector();

  Optional<CodeableConcept> method();

  Optional<List<Extension>> extension();

  Optional<Duration> duration();

  Optional<List<Extension>> modifierExtension();

  Optional<String> id();

  Optional<CodeableConcept> fastingStatusCodeableConcept();

  static ImmutableSpecimen_Collection.Builder builder() {
    return ImmutableSpecimen_Collection.builder();
  }
}
