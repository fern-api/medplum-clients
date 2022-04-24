package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableOperationOutcome.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface OperationOutcome {
  List<OperationOutcome_Issue> issue();

  Optional<code> language();

  Optional<uri> implicitRules();

  Optional<ResourceList> resource();

  String resourceType();

  Optional<Integer> status();

  Optional<id> id();

  Optional<List<ResourceList>> contained();

  Optional<Narrative> text();

  Optional<List<Extension>> extension();

  Optional<Meta> meta();

  Optional<List<Extension>> modifierExtension();

  static ImmutableOperationOutcome.ResourceTypeBuildStage builder() {
    return ImmutableOperationOutcome.builder();
  }
}
