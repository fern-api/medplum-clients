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
  Optional<List<Extension>> modifierExtension();

  Optional<ResourceList> resource();

  Optional<Meta> meta();

  Optional<Code> language();

  Optional<List<Extension>> extension();

  String resourceType();

  Optional<Narrative> text();

  Optional<Uri> implicitRules();

  Optional<Integer> status();

  Optional<List<ResourceList>> contained();

  List<OperationOutcome_Issue> issue();

  Optional<Id> id();

  static ImmutableOperationOutcome.ResourceTypeBuildStage builder() {
    return ImmutableOperationOutcome.builder();
  }
}
