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
    as = ImmutableDeviceUseStatement.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface DeviceUseStatement {
  Optional<List<Extension>> extension();

  Optional<Period> timingPeriod();

  Optional<Id> id();

  Optional<List<Reference>> reasonReference();

  Optional<List<ResourceList>> contained();

  Optional<List<Identifier>> identifier();

  Optional<DateTime> recordedOn();

  Reference device();

  Optional<List<Reference>> derivedFrom();

  Reference subject();

  String resourceType();

  Optional<Uri> implicitRules();

  Optional<List<CodeableConcept>> reasonCode();

  Optional<DeviceusestatementStatus> status();

  Optional<CodeableConcept> bodySite();

  Optional<List<Annotation>> note();

  Optional<Meta> meta();

  Optional<Timing> timingTiming();

  Optional<String> timingDateTime();

  Optional<Code> language();

  Optional<List<Extension>> modifierExtension();

  Optional<Reference> source();

  Optional<Narrative> text();

  Optional<List<Reference>> basedOn();

  static ImmutableDeviceUseStatement.DeviceBuildStage builder() {
    return ImmutableDeviceUseStatement.builder();
  }
}
