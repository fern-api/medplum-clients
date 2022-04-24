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
    as = ImmutableDeviceUseStatement.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface DeviceUseStatement {
  Optional<String> timingDateTime();

  String resourceType();

  Optional<Reference> source();

  Optional<List<Reference>> basedOn();

  Optional<List<ResourceList>> contained();

  Optional<dateTime> recordedOn();

  Optional<uri> implicitRules();

  Optional<List<CodeableConcept>> reasonCode();

  Optional<List<Reference>> reasonReference();

  Optional<Narrative> text();

  Reference device();

  Optional<DeviceusestatementStatus> status();

  Optional<List<Reference>> derivedFrom();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Identifier>> identifier();

  Reference subject();

  Optional<code> language();

  Optional<Timing> timingTiming();

  Optional<List<Annotation>> note();

  Optional<CodeableConcept> bodySite();

  Optional<Period> timingPeriod();

  Optional<id> id();

  Optional<List<Extension>> extension();

  Optional<Meta> meta();

  static ImmutableDeviceUseStatement.ResourceTypeBuildStage builder() {
    return ImmutableDeviceUseStatement.builder();
  }
}
