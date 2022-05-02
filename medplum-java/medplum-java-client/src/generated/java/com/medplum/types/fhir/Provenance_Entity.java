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
    as = ImmutableProvenance_Entity.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Provenance_Entity {
  Optional<Provenance_entityRole> role();

  Optional<List<Extension>> modifierExtension();

  Optional<String> id();

  Reference what();

  Optional<List<Extension>> extension();

  Optional<List<Provenance_Agent>> agent();

  static ImmutableProvenance_Entity.WhatBuildStage builder() {
    return ImmutableProvenance_Entity.builder();
  }
}
