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
  Optional<Narrative> text();

  Optional<ResourceList> resource();

  Optional<List<Extension>> modifierExtension();

  String resourceType();

  Optional<Id> id();

  Optional<List<Extension>> extension();

  List<OperationOutcome_Issue> issue();

  Optional<Integer> status();

  Optional<Uri> implicitRules();

  Optional<Meta> meta();

  Optional<List<ResourceList>> contained();

  Optional<Code> language();

  static ImmutableOperationOutcome.ResourceTypeBuildStage builder() {
    return ImmutableOperationOutcome.builder();
  }
}
