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
  Optional<Code> language();

  Optional<Timing> timingTiming();

  Optional<CodeableConcept> bodySite();

  Optional<Meta> meta();

  Optional<List<Reference>> derivedFrom();

  Reference device();

  Optional<List<CodeableConcept>> reasonCode();

  Optional<Id> id();

  Optional<List<Reference>> reasonReference();

  Reference subject();

  Optional<Period> timingPeriod();

  Optional<Reference> source();

  Optional<String> timingDateTime();

  Optional<DeviceusestatementStatus> status();

  Optional<List<Annotation>> note();

  String resourceType();

  Optional<DateTime> recordedOn();

  Optional<List<Identifier>> identifier();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<Narrative> text();

  Optional<List<Reference>> basedOn();

  Optional<List<ResourceList>> contained();

  Optional<Uri> implicitRules();

  static ImmutableDeviceUseStatement.DeviceBuildStage builder() {
    return ImmutableDeviceUseStatement.builder();
  }
}
