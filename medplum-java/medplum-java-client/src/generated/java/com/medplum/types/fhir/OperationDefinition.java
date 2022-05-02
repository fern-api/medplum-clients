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
  Optional<Canonical> base();

  Optional<Canonical> outputProfile();

  Optional<List<UsageContext>> useContext();

  Optional<String> title();

  Optional<List<Extension>> extension();

  Optional<OperationdefinitionStatus> status();

  Optional<Markdown> description();

  Optional<Markdown> comment();

  Optional<List<Code>> resource();

  Optional<String> name();

  Optional<Boolean> system();

  Optional<List<ContactDetail>> contact();

  Optional<Uri> implicitRules();

  Optional<Boolean> type();

  Optional<List<ResourceList>> contained();

  Optional<Canonical> inputProfile();

  Optional<Boolean> experimental();

  Optional<List<OperationDefinition_Overload>> overload();

  Optional<String> publisher();

  Optional<String> version();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<List<Extension>> modifierExtension();

  Optional<Code> code();

  Optional<Boolean> affectsState();

  Optional<Uri> url();

  Optional<DateTime> date();

  Optional<List<OperationDefinition_Parameter>> parameter();

  Optional<Code> language();

  Optional<Id> id();

  Optional<Narrative> text();

  Optional<OperationdefinitionKind> kind();

  Optional<Markdown> purpose();

  String resourceType();

  Optional<Meta> meta();

  Optional<Boolean> instance();

  static ImmutableOperationDefinition.ResourceTypeBuildStage builder() {
    return ImmutableOperationDefinition.builder();
  }
}
