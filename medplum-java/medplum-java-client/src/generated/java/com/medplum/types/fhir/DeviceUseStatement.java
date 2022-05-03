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
  Reference subject();

  Optional<Timing> timingTiming();

  Optional<List<Reference>> basedOn();

  Optional<Uri> implicitRules();

  Optional<Meta> meta();

  Optional<List<Identifier>> identifier();

  Optional<CodeableConcept> bodySite();

  String resourceType();

  Optional<List<Extension>> modifierExtension();

  Optional<Reference> source();

  Optional<List<Extension>> extension();

  Reference device();

  Optional<DeviceusestatementStatus> status();

  Optional<List<ResourceList>> contained();

  Optional<Period> timingPeriod();

  Optional<DateTime> recordedOn();

  Optional<Narrative> text();

  Optional<List<Annotation>> note();

  Optional<Code> language();

  Optional<List<Reference>> reasonReference();

  Optional<Id> id();

  Optional<List<CodeableConcept>> reasonCode();

  Optional<List<Reference>> derivedFrom();

  Optional<String> timingDateTime();

  static ImmutableDeviceUseStatement.SubjectBuildStage builder() {
    return ImmutableDeviceUseStatement.builder();
  }
}
