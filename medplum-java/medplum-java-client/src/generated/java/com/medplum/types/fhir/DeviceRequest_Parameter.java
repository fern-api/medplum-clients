package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableDeviceRequest_Parameter.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface DeviceRequest_Parameter {
  Optional<String> id();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<Range> valueRange();

  Optional<CodeableConcept> code();

  Optional<Boolean> valueBoolean();

  Optional<CodeableConcept> valueCodeableConcept();

  Optional<Quantity> valueQuantity();

  static ImmutableDeviceRequest_Parameter.Builder builder() {
    return ImmutableDeviceRequest_Parameter.builder();
  }
}
