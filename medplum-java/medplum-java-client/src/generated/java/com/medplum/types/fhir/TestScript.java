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
  Optional<List<Reference>> profile();

  Optional<TestscriptStatus> status();

  Optional<Uri> implicitRules();

  Optional<DateTime> date();

  Optional<String> publisher();

  Optional<TestScript_Metadata> metadata();

  Optional<Markdown> description();

  Optional<Code> language();

  Optional<List<TestScript_Origin>> origin();

  Optional<List<TestScript_Test>> test();

  Optional<List<ResourceList>> contained();

  Optional<List<TestScript_Fixture>> fixture();

  Optional<Uri> url();

  Optional<List<TestScript_Variable>> variable();

  Optional<List<Extension>> modifierExtension();

  Optional<String> version();

  Optional<Id> id();

  Optional<List<TestScript_Destination>> destination();

  Optional<Meta> meta();

  Optional<TestScript_Setup> setup();

  Optional<Identifier> identifier();

  Optional<List<UsageContext>> useContext();

  Optional<String> title();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<String> name();

  Optional<Narrative> text();

  Optional<List<Extension>> extension();

  Optional<TestScript_Teardown> teardown();

  Optional<List<ContactDetail>> contact();

  Optional<Markdown> copyright();

  Optional<Boolean> experimental();

  String resourceType();

  Optional<Markdown> purpose();

  static ImmutableTestScript.ResourceTypeBuildStage builder() {
    return ImmutableTestScript.builder();
  }
}
