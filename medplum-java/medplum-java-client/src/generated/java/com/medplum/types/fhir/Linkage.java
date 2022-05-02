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
  Optional<Id> id();

  Optional<Boolean> active();

  Optional<Narrative> text();

  Optional<Uri> implicitRules();

  String resourceType();

  Optional<Reference> author();

  List<Linkage_Item> item();

  Optional<Code> language();

  Optional<Meta> meta();

  Optional<List<Extension>> extension();

  Optional<List<ResourceList>> contained();

  Optional<List<Extension>> modifierExtension();

  static ImmutableLinkage.ResourceTypeBuildStage builder() {
    return ImmutableLinkage.builder();
  }
}
