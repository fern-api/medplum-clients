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
    as = ImmutableDeviceMetric.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface DeviceMetric {
  Optional<DevicemetricOperationalstatus> operationalStatus();

  Optional<Narrative> text();

  Optional<Timing> measurementPeriod();

  Optional<Uri> implicitRules();

  Optional<List<Identifier>> identifier();

  Optional<List<Extension>> modifierExtension();

  Optional<Meta> meta();

  Optional<Code> language();

  Optional<List<ResourceList>> contained();

  Optional<List<DeviceMetric_Calibration>> calibration();

  String resourceType();

  Optional<DevicemetricCategory> category();

  Optional<Reference> parent();

  Optional<Id> id();

  CodeableConcept type();

  Optional<List<Extension>> extension();

  Optional<CodeableConcept> unit();

  Optional<Reference> source();

  Optional<DevicemetricColor> color();

  static ImmutableDeviceMetric.ResourceTypeBuildStage builder() {
    return ImmutableDeviceMetric.builder();
  }
}
