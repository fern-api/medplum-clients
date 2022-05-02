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
    as = ImmutableTestScript.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface TestScript {
  Optional<Id> id();

  Optional<List<Extension>> modifierExtension();

  Optional<Uri> url();

  Optional<List<TestScript_Destination>> destination();

  Optional<Markdown> copyright();

  Optional<TestscriptStatus> status();

  String resourceType();

  Optional<List<Extension>> extension();

  Optional<DateTime> date();

  Optional<Meta> meta();

  Optional<TestScript_Setup> setup();

  Optional<List<UsageContext>> useContext();

  Optional<TestScript_Metadata> metadata();

  Optional<List<Reference>> profile();

  Optional<Code> language();

  Optional<List<TestScript_Fixture>> fixture();

  Optional<List<ResourceList>> contained();

  Optional<List<TestScript_Variable>> variable();

  Optional<List<TestScript_Origin>> origin();

  Optional<TestScript_Teardown> teardown();

  Optional<List<ContactDetail>> contact();

  Optional<String> name();

  Optional<List<TestScript_Test>> test();

  Optional<String> title();

  Optional<Boolean> experimental();

  Optional<Markdown> description();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<String> publisher();

  Optional<Narrative> text();

  Optional<Identifier> identifier();

  Optional<Markdown> purpose();

  Optional<String> version();

  Optional<Uri> implicitRules();

  static ImmutableTestScript.ResourceTypeBuildStage builder() {
    return ImmutableTestScript.builder();
  }
}
