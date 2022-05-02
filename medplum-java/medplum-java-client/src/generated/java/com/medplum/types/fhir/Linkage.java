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
  Optional<Code> language();

  String resourceType();

  Optional<Narrative> text();

  Optional<Uri> implicitRules();

  Optional<Reference> author();

  Optional<Meta> meta();

  Optional<List<Extension>> modifierExtension();

  Optional<List<ResourceList>> contained();

  List<Linkage_Item> item();

  Optional<List<Extension>> extension();

  Optional<Id> id();

  Optional<Boolean> active();

  static ImmutableLinkage.ResourceTypeBuildStage builder() {
    return ImmutableLinkage.builder();
  }
}
