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
  Optional<Narrative> text();

  Optional<Timing> measurementPeriod();

  Optional<List<DeviceMetric_Calibration>> calibration();

  Optional<Uri> implicitRules();

  Optional<Reference> source();

  Optional<CodeableConcept> unit();

  Optional<Code> language();

  CodeableConcept type();

  Optional<DevicemetricColor> color();

  Optional<Reference> parent();

  Optional<DevicemetricOperationalstatus> operationalStatus();

  Optional<Id> id();

  Optional<List<ResourceList>> contained();

  Optional<DevicemetricCategory> category();

  Optional<List<Identifier>> identifier();

  Optional<Meta> meta();

  String resourceType();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  static ImmutableDeviceMetric.TypeBuildStage builder() {
    return ImmutableDeviceMetric.builder();
  }
}
