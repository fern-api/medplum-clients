package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
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
  Optional<Duration> duration();

  Optional<Reference> collector();

  Optional<Period> collectedPeriod();

  Optional<Quantity> quantity();

  Optional<Duration> fastingStatusDuration();

  Optional<CodeableConcept> fastingStatusCodeableConcept();

  Optional<String> id();

  Optional<CodeableConcept> method();

  Optional<CodeableConcept> bodySite();

  Optional<List<Extension>> modifierExtension();

  Optional<String> collectedDateTime();

  Optional<List<Extension>> extension();

  static ImmutableSpecimen_Collection.Builder builder() {
    return ImmutableSpecimen_Collection.builder();
  }
}
