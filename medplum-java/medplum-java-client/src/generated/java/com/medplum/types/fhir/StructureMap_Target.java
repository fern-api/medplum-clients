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
    as = ImmutableStructureMap_Target.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface StructureMap_Target {
  Optional<String> element();

  Optional<Id> listRuleId();

  Optional<Structuremap_targetTransform> transform();

  Optional<List<Structuremap_targetListmodeItem>> listMode();

  Optional<List<Extension>> modifierExtension();

  Optional<Structuremap_targetContexttype> contextType();

  Optional<Id> variable();

  Optional<Id> context();

  Optional<String> id();

  Optional<List<Extension>> extension();

  Optional<List<StructureMap_Parameter>> parameter();

  static ImmutableStructureMap_Target.Builder builder() {
    return ImmutableStructureMap_Target.builder();
  }
}
