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
    as = ImmutableStructureMap_Target.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface StructureMap_Target {
  Optional<id> variable();

  Optional<String> id();

  Optional<String> element();

  Optional<id> context();

  Optional<id> listRuleId();

  Optional<Structuremap_targetTransform> transform();

  Optional<List<Extension>> extension();

  Optional<List<Structuremap_targetListmodeItem>> listMode();

  Optional<List<Extension>> modifierExtension();

  Optional<Structuremap_targetContexttype> contextType();

  Optional<List<StructureMap_Parameter>> parameter();

  static ImmutableStructureMap_Target.Builder builder() {
    return ImmutableStructureMap_Target.builder();
  }
}
