package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableTestScript_Operation.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface TestScript_Operation {
  Optional<Id> responseId();

  Optional<String> url();

  Optional<Coding> type();

  Optional<Code> accept();

  Optional<String> label();

  Optional<Testscript_operationMethod> method();

  Optional<Code> resource();

  Optional<List<TestScript_RequestHeader>> requestHeader();

  Optional<String> id();

  Optional<Id> sourceId();

  Optional<Integer> destination();

  Optional<String> description();

  Optional<Id> targetId();

  Optional<Integer> origin();

  Optional<Id> requestId();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<String> params();

  Optional<Boolean> encodeRequestUrl();

  Optional<Code> contentType();

  static ImmutableTestScript_Operation.Builder builder() {
    return ImmutableTestScript_Operation.builder();
  }
}
