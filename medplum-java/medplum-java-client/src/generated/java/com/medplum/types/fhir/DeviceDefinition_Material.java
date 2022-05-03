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
  Optional<Boolean> allergenicIndicator();

  Optional<List<Extension>> extension();

  CodeableConcept substance();

  Optional<List<Extension>> modifierExtension();

  Optional<Boolean> alternate();

  Optional<String> id();

  static ImmutableDeviceDefinition_Material.SubstanceBuildStage builder() {
    return ImmutableDeviceDefinition_Material.builder();
  }
}
