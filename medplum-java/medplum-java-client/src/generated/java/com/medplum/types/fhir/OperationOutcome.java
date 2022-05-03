package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
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
  Optional<ResourceList> resource();

  String resourceType();

  Optional<List<ResourceList>> contained();

  Optional<Narrative> text();

  Optional<Id> id();

  Optional<Uri> implicitRules();

  Optional<Integer> status();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Extension>> extension();

  List<OperationOutcome_Issue> issue();

  Optional<Meta> meta();

  Optional<Code> language();

  static ImmutableOperationOutcome.ResourceTypeBuildStage builder() {
    return ImmutableOperationOutcome.builder();
  }
}
