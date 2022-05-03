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
    as = ImmutableLinkage.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Linkage {
  Optional<Reference> author();

  List<Linkage_Item> item();

  Optional<Meta> meta();

  Optional<Boolean> active();

  Optional<Uri> implicitRules();

  Optional<Narrative> text();

  String resourceType();

  Optional<List<ResourceList>> contained();

  Optional<List<Extension>> extension();

  Optional<Id> id();

  Optional<List<Extension>> modifierExtension();

  Optional<Code> language();

  static ImmutableLinkage.ResourceTypeBuildStage builder() {
    return ImmutableLinkage.builder();
  }
}
