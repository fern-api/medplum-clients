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
  Optional<DevicemetricColor> color();

  Optional<Uri> implicitRules();

  Optional<List<Extension>> modifierExtension();

  Optional<Meta> meta();

  CodeableConcept type();

  Optional<DevicemetricCategory> category();

  Optional<List<ResourceList>> contained();

  Optional<Reference> source();

  Optional<Code> language();

  Optional<List<Identifier>> identifier();

  Optional<Id> id();

  Optional<Timing> measurementPeriod();

  Optional<List<DeviceMetric_Calibration>> calibration();

  Optional<Narrative> text();

  Optional<Reference> parent();

  Optional<CodeableConcept> unit();

  String resourceType();

  Optional<DevicemetricOperationalstatus> operationalStatus();

  Optional<List<Extension>> extension();

  static ImmutableDeviceMetric.TypeBuildStage builder() {
    return ImmutableDeviceMetric.builder();
  }
}
