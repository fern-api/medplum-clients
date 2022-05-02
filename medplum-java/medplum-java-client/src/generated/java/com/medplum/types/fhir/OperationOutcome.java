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
  List<OperationOutcome_Issue> issue();

  Optional<Integer> status();

  Optional<List<ResourceList>> contained();

  Optional<Uri> implicitRules();

  Optional<Code> language();

  String resourceType();

  Optional<Id> id();

  Optional<Meta> meta();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<ResourceList> resource();

  Optional<Narrative> text();

  static ImmutableOperationOutcome.ResourceTypeBuildStage builder() {
    return ImmutableOperationOutcome.builder();
  }
}
