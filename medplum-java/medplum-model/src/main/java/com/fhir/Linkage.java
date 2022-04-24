package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableLinkage.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Linkage {
  Optional<List<Extension>> modifierExtension();

  Optional<Reference> author();

  Optional<List<Extension>> extension();

  Optional<Boolean> active();

  Optional<List<ResourceList>> contained();

  Optional<id> id();

  Optional<Meta> meta();

  String resourceType();

  Optional<Narrative> text();

  Optional<code> language();

  List<Linkage_Item> item();

  Optional<uri> implicitRules();

  static ImmutableLinkage.ResourceTypeBuildStage builder() {
    return ImmutableLinkage.builder();
  }
}
