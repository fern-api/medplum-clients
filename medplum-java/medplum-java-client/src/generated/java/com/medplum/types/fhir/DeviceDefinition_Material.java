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
    as = ImmutableDeviceDefinition_Material.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface DeviceDefinition_Material {
  Optional<Boolean> alternate();

  Optional<String> id();

  Optional<List<Extension>> extension();

  Optional<Boolean> allergenicIndicator();

  Optional<List<Extension>> modifierExtension();

  CodeableConcept substance();

  static ImmutableDeviceDefinition_Material.SubstanceBuildStage builder() {
    return ImmutableDeviceDefinition_Material.builder();
  }
}
