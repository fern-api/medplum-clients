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
  Optional<Structuremap_targetTransform> transform();

  Optional<List<Extension>> extension();

  Optional<Structuremap_targetContexttype> contextType();

  Optional<String> element();

  Optional<List<Structuremap_targetListmodeItem>> listMode();

  Optional<List<Extension>> modifierExtension();

  Optional<Id> listRuleId();

  Optional<List<StructureMap_Parameter>> parameter();

  Optional<String> id();

  Optional<Id> variable();

  Optional<Id> context();

  static ImmutableStructureMap_Target.Builder builder() {
    return ImmutableStructureMap_Target.builder();
  }
}
