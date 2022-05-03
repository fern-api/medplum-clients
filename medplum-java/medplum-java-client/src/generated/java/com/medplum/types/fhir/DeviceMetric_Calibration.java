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
    as = ImmutableDeviceMetric_Calibration.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface DeviceMetric_Calibration {
  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  Optional<Instant> time();

  Optional<Devicemetric_calibrationType> type();

  Optional<List<Extension>> extension();

  Optional<Devicemetric_calibrationState> state();

  static ImmutableDeviceMetric_Calibration.Builder builder() {
    return ImmutableDeviceMetric_Calibration.builder();
  }
}
