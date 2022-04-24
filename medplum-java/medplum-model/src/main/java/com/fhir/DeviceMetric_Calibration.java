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
    as = ImmutableDeviceMetric_Calibration.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface DeviceMetric_Calibration {
  Optional<Devicemetric_calibrationState> state();

  Optional<instant> time();

  Optional<String> id();

  Optional<List<Extension>> extension();

  Optional<Devicemetric_calibrationType> type();

  Optional<List<Extension>> modifierExtension();

  static ImmutableDeviceMetric_Calibration.Builder builder() {
    return ImmutableDeviceMetric_Calibration.builder();
  }
}
