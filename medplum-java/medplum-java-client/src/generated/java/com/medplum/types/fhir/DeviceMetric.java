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
  Optional<List<Extension>> extension();

  Optional<DevicemetricOperationalstatus> operationalStatus();

  Optional<List<ResourceList>> contained();

  Optional<DevicemetricCategory> category();

  Optional<CodeableConcept> unit();

  Optional<Id> id();

  Optional<Reference> parent();

  Optional<Timing> measurementPeriod();

  Optional<List<Extension>> modifierExtension();

  CodeableConcept type();

  Optional<Meta> meta();

  Optional<Reference> source();

  Optional<Code> language();

  Optional<Narrative> text();

  Optional<DevicemetricColor> color();

  String resourceType();

  Optional<List<DeviceMetric_Calibration>> calibration();

  Optional<Uri> implicitRules();

  Optional<List<Identifier>> identifier();

  static ImmutableDeviceMetric.TypeBuildStage builder() {
    return ImmutableDeviceMetric.builder();
  }
}
