package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableExpression.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Expression {
  Optional<Id> name();

  Optional<Uri> reference();

  Optional<String> expression();

  Optional<List<Extension>> extension();

  Optional<String> id();

  Optional<String> description();

  Optional<ExpressionLanguage> language();

  static ImmutableExpression.Builder builder() {
    return ImmutableExpression.builder();
  }
}
