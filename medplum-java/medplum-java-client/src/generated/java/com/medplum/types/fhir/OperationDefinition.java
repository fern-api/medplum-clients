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
    as = ImmutableOperationDefinition.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface OperationDefinition {
  Optional<DateTime> date();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<Markdown> purpose();

  Optional<List<UsageContext>> useContext();

  Optional<OperationdefinitionStatus> status();

  Optional<List<OperationDefinition_Overload>> overload();

  Optional<List<ContactDetail>> contact();

  Optional<List<ResourceList>> contained();

  String resourceType();

  Optional<Boolean> type();

  Optional<String> version();

  Optional<OperationdefinitionKind> kind();

  Optional<String> name();

  Optional<List<OperationDefinition_Parameter>> parameter();

  Optional<Canonical> base();

  Optional<Id> id();

  Optional<Boolean> system();

  Optional<List<Code>> resource();

  Optional<Markdown> description();

  Optional<Canonical> inputProfile();

  Optional<List<Extension>> extension();

  Optional<Boolean> experimental();

  Optional<String> publisher();

  Optional<List<Extension>> modifierExtension();

  Optional<Code> code();

  Optional<Uri> url();

  Optional<Meta> meta();

  Optional<Boolean> affectsState();

  Optional<Narrative> text();

  Optional<Canonical> outputProfile();

  Optional<Uri> implicitRules();

  Optional<Markdown> comment();

  Optional<Code> language();

  Optional<String> title();

  Optional<Boolean> instance();

  static ImmutableOperationDefinition.ResourceTypeBuildStage builder() {
    return ImmutableOperationDefinition.builder();
  }
}
