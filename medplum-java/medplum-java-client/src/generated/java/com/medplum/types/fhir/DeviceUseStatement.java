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
  Optional<List<Reference>> derivedFrom();

  Optional<Uri> implicitRules();

  Optional<List<Identifier>> identifier();

  Optional<String> timingDateTime();

  Optional<List<Extension>> modifierExtension();

  Optional<DeviceusestatementStatus> status();

  Optional<List<CodeableConcept>> reasonCode();

  Optional<Period> timingPeriod();

  Optional<Code> language();

  Optional<CodeableConcept> bodySite();

  Optional<Narrative> text();

  Optional<Timing> timingTiming();

  Reference device();

  Optional<List<Annotation>> note();

  Optional<List<Extension>> extension();

  Optional<Reference> source();

  Optional<DateTime> recordedOn();

  Optional<Id> id();

  Optional<List<Reference>> reasonReference();

  Reference subject();

  String resourceType();

  Optional<List<ResourceList>> contained();

  Optional<List<Reference>> basedOn();

  Optional<Meta> meta();

  static ImmutableDeviceUseStatement.DeviceBuildStage builder() {
    return ImmutableDeviceUseStatement.builder();
  }
}
