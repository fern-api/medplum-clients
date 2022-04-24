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
    as = ImmutableDeviceMetric.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface DeviceMetric {
  Optional<Narrative> text();

  Optional<Timing> measurementPeriod();

  Optional<DevicemetricColor> color();

  Optional<CodeableConcept> unit();

  Optional<id> id();

  Optional<DevicemetricOperationalstatus> operationalStatus();

  String resourceType();

  Optional<code> language();

  CodeableConcept type();

  Optional<List<DeviceMetric_Calibration>> calibration();

  Optional<List<ResourceList>> contained();

  Optional<List<Extension>> extension();

  Optional<Reference> source();

  Optional<Meta> meta();

  Optional<DevicemetricCategory> category();

  Optional<List<Extension>> modifierExtension();

  Optional<Reference> parent();

  Optional<uri> implicitRules();

  Optional<List<Identifier>> identifier();

  static ImmutableDeviceMetric.ResourceTypeBuildStage builder() {
    return ImmutableDeviceMetric.builder();
  }
}
